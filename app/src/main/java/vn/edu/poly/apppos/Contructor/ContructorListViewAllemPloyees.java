package vn.edu.poly.apppos.Contructor;

public class ContructorListViewAllemPloyees {
    String image;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContructorListViewAllemPloyees() {
    }

    public ContructorListViewAllemPloyees(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
