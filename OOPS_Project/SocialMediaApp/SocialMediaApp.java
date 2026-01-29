package SocialMediaApp;


    // Parent class
class Post {

    void likeOf() {
        System.out.println("Post liked");
    }

    void shareOf() {
        System.out.println("Post shared");
    }

    void commentOf() {
        System.out.println("Comment added on post");
    }
}

// Child class 1
class PhotoEdit extends Post {

    void filterOf() {
        System.out.println("Photo filter applied");
    }
}

// Child class 2
class VideoEdit extends Post {

    void trimOf() {
        System.out.println("Video trimmed");
    }
}

// Main class
public class SocialMediaApp {

    public static void main(String[] args) {

        PhotoEdit photo = new PhotoEdit();
        photo.likeOf();
        photo.shareOf();
        photo.commentOf();
        photo.filterOf();

        System.out.println("--------------");

        VideoEdit video = new VideoEdit();
        video.likeOf();
        video.shareOf();
        video.commentOf();
        video.trimOf();
    }
}
