package factory;

public class main {
    public static void main(String[] args) {

        webpagedirector director = new webpagedirector();
        webpage articlePage = director.createArticle("Content of the article.");

        System.out.println("Article Page:\n" + articlePage.toString());
        System.out.println("\n-------------------------\n");


        webpage form = director.createForm("User Login", "Name, Password");

        System.out.println("Form Page:\n" + form.toString());
    }
}
