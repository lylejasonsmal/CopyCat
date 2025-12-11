package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.PricingTier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PricingTierFactoryTest {

    @Test
    void createPricingTier() {
        //Act
        PricingTier pricingTier = PricingTierFactory.CreatePricingTier(10);

        //Print for visual inspection
        System.out.println(pricingTier);

        //Assert
        Assertions.assertNotNull(pricingTier);
        Assertions.assertEquals(10, pricingTier.getPagesToBePrinted());
        Assertions.assertEquals(17.5, pricingTier.getPriceToBeApplied());
    }
}