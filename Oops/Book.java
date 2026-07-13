public class Book{
    private int id;
    private String title;
    private String author;
    private String issuedAt;
    private String updatedAt;

    public Book(int id, String title,String author,  String issuedAt, String  updatedAt){
        this.id = id;
        this.title = title;
        this.author = author;
        this.issuedAt = issuedAt;
        this.updatedAt= updatedAt;



    }
    public int getId(){
        return id;

    }
    public String getTitle(){
        return title;

    }
    public String  getAuthor(){
        return author;

    }
    public String getIssuedAt(){
        return issuedAt;


    }
    public String getUpdatedAt(){
        return updatedAt;

    }

    @Override
    public String toString() {
        return id + " : " + title + " by  " + author + " of  " + issuedAt + " " + updatedAt;
    }

}