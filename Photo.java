public class Photo {

    private String imageURL;

    public String getimageURL() {
        return this.imageURL;
    }

    public String toString() {
        return getimageURL();
    }


    public void setimageURL(String imageURL) {
        this.imageURL = imageURL;

    }


    public Photo remove(User user) {

        return null;
    }


}
