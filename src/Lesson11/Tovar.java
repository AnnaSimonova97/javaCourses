package Lesson11;

public class Tovar {
    private int price;
    private String name;
    private  int id;

    public Tovar() {

    }
    public Tovar(int price, String name, int id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //усли еqual равны то хешкоы одинаковые
    // если хеш коды совпадают то не факт что они иквал
    //хешкод должен быть одинаковый всегда. привязка к статичным значениям
    // ---

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (price != tovar.price) return false;
        if (id != tovar.id) return false;
        return name != null ? name.equals(tovar.name) : tovar.name == null;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
