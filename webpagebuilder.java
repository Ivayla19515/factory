package factory;

public class webpagebuilder {
    private String title;
    private String header;
    private String content;
    private String footer;

    public webpagebuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public webpagebuilder setHeader(String header) {
        this.header = header;
        return this;
    }

    public webpagebuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public webpagebuilder setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public webpage build() {
        return new webpage(title, header, content, footer);
    }
}
