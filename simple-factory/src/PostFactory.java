public class PostFactory {
    public static Post createPost(PostType type){
        switch(type){
            case BLOG:
                return new BlogPost();
            case NEWS:
                return new NewsPost();
            case PRODUCT:
                return new ProductPost();
            default:
                throw new IllegalArgumentException();
        }
    }
}
