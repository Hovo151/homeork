package blog;


public class PostStorageImpl implements PostStorage {
    Post[] posts = new Post[10];
    int size = 0;


    @Override
    public void add(Post post) {
        if (size > posts.length - 1) {
            extend();
        } else {
            posts[size] = post;

            size++;
        }
    }

    private void extend() {
        Post[] newPost = new Post[size + 10];
        for (int i = 0; i < size; i++) {
            newPost[i] = posts[i];

        }
        posts = newPost;
    }


    @Override
    public Post getPostByTitle(String title) {
        Post post = new Post();
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title)) {
                post = posts[i];
            }

        }
        return post;
    }

    @Override
    public void searchPostsByKeyword(String keyword) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().contains(keyword) || posts[i].getText().contains(keyword)) {
                System.out.println(posts[i]);
            }
        }
    }

    @Override
    public void printAllPosts() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
    }


    @Override
    public void printPostsByCategory(String category) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getCategory().name().equalsIgnoreCase(category)) {
                System.out.println(posts[i]);
            }


        }
    }

    @Override
    public void deletePostBytitle(String title) {
        Post[] newPosts = new Post[size - 1];
        for (int i = 0; i < size; i++) {
            if (!posts[i].getTitle().equals(title)) {
                newPosts[i] = posts[i];
            }
        }
        posts = newPosts;
    }

    @Override
    public Post changePostBytitle(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equals(title)) {
                return posts[i];

            }
        }
        return null;
    }

    @Override
    public void deleteByCategory(String category) {
        for (int i = 0; i < size; i++) {

        }
    }
}

