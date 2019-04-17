package vn.edu.poly.apppos.Contructor;

public class ContructorGirdviewOther {
    String image;
    int position;

    public ContructorGirdviewOther() {
    }

    public ContructorGirdviewOther(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    //    public ContructorGirdviewOther(String image) {
//        this.image = image;
//    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
