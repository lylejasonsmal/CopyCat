package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.PricingTier;

public class PricingTierFactory {
    public static PricingTier CreatePricingTier(int pagesToBePrinted){
        return PricingTier.builder()
                .pagesToBePrinted(pagesToBePrinted)
                .build();
    }
}
