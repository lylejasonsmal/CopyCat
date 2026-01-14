package com.mugprintz.copycat.factory;

import com.mugprintz.copycat.domain.PricingTier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.bean.override.convention.TestBean;

import static org.junit.jupiter.api.Assertions.*;

class PricingTierFactoryTest {

    @Test
    void WHEN_requesting_10_pages_or_more_SHOULD_return_pages_to_be_printed_and_correct_price() {
        //Act
        PricingTier pricingTier = PricingTierFactory.CreatePricingTier(10);

        //Print for visual inspection
        System.out.println(pricingTier);

        //Assert
        Assertions.assertNotNull(pricingTier);
        Assertions.assertEquals(10, pricingTier.getPagesToBePrinted());
        Assertions.assertEquals(17.5, pricingTier.getPriceToBeApplied());
    }

    @Test
    void WHEN_requesting_20_pages_or_more_SHOULD_return_pages_to_be_printed_and_correct_price() {
        //Act
        PricingTier pricingTier = PricingTierFactory.CreatePricingTier(20);

        //Print for visual inspection
        System.out.println(pricingTier);

        //Assert
        Assertions.assertNotNull(pricingTier);
        Assertions.assertEquals(20, pricingTier.getPagesToBePrinted());
        Assertions.assertEquals(30, pricingTier.getPriceToBeApplied());
    }

    @Test
    void WHEN_requesting_30_pages_or_more_SHOULD_return_pages_to_be_printed_and_correct_price() {
        //Act
        PricingTier pricingTier = PricingTierFactory.CreatePricingTier(30);

        //Print for visual inspection
        System.out.println(pricingTier);

        //Assert
        Assertions.assertNotNull(pricingTier);
        Assertions.assertEquals(30, pricingTier.getPagesToBePrinted());
        Assertions.assertEquals(37.5, pricingTier.getPriceToBeApplied());
    }
}