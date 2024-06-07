public class Client {
    public static void main(String[] args) {
        Post post = PostFactory.createPost(PostType.BLOG);
        System.out.println(post);

        post = PostFactory.createPost(PostType.NEWS);
        System.out.println(post);

        post = PostFactory.createPost(PostType.PRODUCT);
        System.out.println(post);
    }
}
