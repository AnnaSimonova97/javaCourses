package Lesson8.Practica;

public class Tovar {
    private String fullName;
    private int fullPrice;
    private int salePrice;
    private String proizvoditel;
    private Orzv [] orzvs = new Orzv[1000]; //один товар имеет много отзывов

    public Tovar() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public Orzv[] getOrzvs() {
        return orzvs;
    }

    public void setOrzvs(Orzv[] orzvs) {
        this.orzvs = orzvs;
    }
    public void addOrzvToTovar(Orzv orzv) {
        for (int i = 0; i < orzvs.length; i++) {
            if (orzvs[i] == null) {
                orzvs[i] = orzv;
                break;
            }
        }
    }
    public double avgRating() {
        double sum = 0;
        int countOrzvs = 0;
        for (Orzv o: orzvs) {
            if (o != null) {
                sum = sum + o.getStars();
                countOrzvs++;
            }
        }
        return sum/countOrzvs;
    }
}
