import java.util.LinkedList;
public class TestDrive {
    public static <photos> void main(String[] args) throws InputValidationException {

        //instantiate 2 photo object
        Photo photo1 = new Photo();
        Photo photo2 = new Photo();

        //instantiate 1 user object
        User user1 = new User();

        //instantiate 1 like object
        Likes likes1 = new Likes();

        //set 2 photos and print them to test Photo class
        photo1.setimageURL("photo of user 2");
        photo2.setimageURL("photo of user 1");

        //print the 2 photos
        System.out.println(photo1.getimageURL());
        System.out.println(photo2.getimageURL());

        //set 1 user and print to test User class
        user1.setUserName("Betty");

        //print the username
        System.out.println(user1.getUserName());

        //Like the 2 photos by Betty the user
        Likes.like(photo1, user1);
        Likes.like(photo2, user1);

        //Test the hasliked method to see if Betty has liked both photos - both should return true
        System.out.println("Should be true: " + likes1.hasliked(photo1, user1));
        System.out.println("Should be true: " + likes1.hasliked(photo2, user1));


        //Test the getAllLikes for Betty. Should print 2 photos.
        System.out.println("Betty liked: " + likes1.getAllLikes(user1));

        //Test the unlike feature by unliking photo1
        likes1.unlike(photo1, user1);
        System.out.println("Betty unliked photo1");


        //Test the getAllLikes - should only print one photo
        System.out.println("Betty liked: " + likes1.getAllLikes(user1));

        //Linked List of photos
        //instantiate photo arraylist object
        LinkedList<String> photos = new LinkedList<>();
        //add photos to list
        photos.add("photo3");
        photos.add("photo 4");
        photos.add("photo 5");
        photos.add("photo 6");

        System.out.println(photos);

        System.out.println(photos.contains("photo3"));
        //remove photo 3 from list
        photos.remove("photo3");

        System.out.println(photos);
        //check photo 3 is not is list anymore, should print false
        System.out.println("contains photo 3?");
        System.out.println(photos.contains("photo3"));

    }
}
