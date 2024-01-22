package factory;

public class webpagedirector {
    String header = "Defaulted header";
    String title = "Defaulted title";
    String content = "Defaulted contend";
    String footer = "Defaulted footer";



    public webpage createArticle(String content) {
        return new webpagebuilder()
                .setTitle(title)
                .setFooter(footer)
                .setHeader(header)
                .setContent(content)
                .build();

    }

    public webpage createForm(String title, String fields) {
        return new webpagebuilder()
                .setTitle(title)
                .setHeader(header)
                .setFooter(footer)
                .setContent("Fields: " + fields)
                .build();
    }
}
