package creational.prototype.code.object.prototype;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    protected abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {
        return id;
    }

    public Shape setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Shape setType(String type) {
        this.type = type;
        return this;
    }
}
