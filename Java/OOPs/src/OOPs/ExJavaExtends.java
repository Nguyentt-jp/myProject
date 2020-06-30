package OOPs;

public class ExJavaExtends {
    private int ma;
    private String name;

    public int getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExJavaExtends{" +
                "ma=" + ma +
                ", name='" + name + '\'' +
                '}';
    }
}
