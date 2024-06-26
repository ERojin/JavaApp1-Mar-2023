package org.csystem.util.numeric;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


@Ignore
public class NumberUtilIsPrimeTest {
    @Test
    public void givenLongValue_whenPrime_thenReturnTrue()
    {
        var input = 710584055392819667L;

        Assert.assertTrue(String.format("%d must be prime", input), NumberUtil.isPrime(input));
    }

    @Test
    public void givenLongValue_whenNotPrime_thenReturnFalse()
    {
        var input = 22;

        Assert.assertFalse(NumberUtil.isPrime(input));
    }
}
