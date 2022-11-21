package Laba_1.Task8;

import java.util.Objects;

public class CustomDouble {
    private int whole;
    private double fractional;
    public CustomDouble(final int whole,final double Fractional)
    {
        this.whole = whole;
        if(Fractional<1.) {
            this.fractional = Fractional;
        }
        else {
            System.out.println("Error:Can`t initialized second part properly");
        }
    }
    public int getWhole() {
        return whole;
    }

    public void setWhole(final int whole) {
        this.whole = whole;
    }

    public double getFractional() {
        return fractional;
    }

    public void setFractional(final double fractional) {
        this.fractional = fractional;
    }

    public  CustomDouble plus(final CustomDouble number2) {
        final double sum = this.toDouble() + number2.toDouble();
        final CustomDouble resultNumber = new CustomDouble((int)sum,sum - (int)sum);
        return resultNumber;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final CustomDouble that = (CustomDouble) o;
        return whole == that.whole && Double.compare(that.fractional, fractional) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(whole, fractional);
    }

    public CustomDouble minus(final CustomDouble number2) {
        final double dif = this.toDouble() - number2.toDouble();
        final CustomDouble resultNumber = new CustomDouble((int)dif,dif - (int)dif);
        return resultNumber;
    }
        public double toDouble()
            {
                return whole + fractional;
            }
    }

