import java.util.*;

public class Likes {
    private static Hashtable<Photo, TreeSet<User>> likes = new Hashtable<>();

    //like photo
    public static void like(Photo photo, User user) {
        try {
            likes.get(photo).add(user);
        } catch (NullPointerException e) {
            likes.put(photo, new TreeSet<>());
            likes.get(photo).add(user);
        }
    }

    //unlike photo
    public static void unlike(Photo photo, User user) {
        try {
            likes.get(photo).remove(user);
        } catch (NullPointerException e) {

        }
    }

    //has liked photo
    public boolean hasliked(Photo photo, User user) {
        try {
            return likes.get(photo).contains(user);
        } catch (NullPointerException e) {
            return false;
        }
    }

    //get all likes
    public List<Photo> getAllLikes(User user) {
        // new empty list
        List<Photo> likedphotos = new ArrayList<Photo>();

        for (Photo photo : likes.keySet()) {
            if (hasliked(photo, user)) {
                // add photo to list
                likedphotos.add(photo);
            }
            // return that initial list
        }

        return likedphotos;

    }


    public String toString() {
        return likes.toString();
    }

    public void get(Photo remove) {
    }

    public void remove(Photo photo1, User user1) {
    }
}
