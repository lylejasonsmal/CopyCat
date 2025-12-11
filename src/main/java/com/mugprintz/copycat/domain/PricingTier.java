package com.mugprintz.copycat.domain;

import com.mugprintz.copycat.domain.interfaces.HasID;
import lombok.*;

@Getter
@Builder
@ToString
@AllArgsConstructor
public class PricingTier extends HasID {
    private long id;
    private int pagesToBePrinted;
    private double priceToBeApplied;

    public double getPriceToBeApplied() {
        this.calculatePrice(); //initialize price
        return this.priceToBeApplied; //return price
    }

    public void calculatePrice(){
        if (this.pagesToBePrinted >= 30) {
            this.priceToBeApplied = this.pagesToBePrinted * 1.25;
        }
        else if (this.pagesToBePrinted >= 20) {
            this.priceToBeApplied = this.pagesToBePrinted * 1.5;
        }
        else if (this.pagesToBePrinted >= 10) {
            this.priceToBeApplied = this.pagesToBePrinted * 1.75;
        }
        else {
            this.priceToBeApplied = this.pagesToBePrinted * 2;
        }
    }
}
