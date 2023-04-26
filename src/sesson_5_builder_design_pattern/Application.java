package sesson_5_builder_design_pattern;

import java.time.LocalDateTime;

public class Application {


    public static class Document{
        private final String title;
        private final String author;
        private final String category;
        private final String content;
        private final LocalDateTime releaseAt;

        public Document(Builder builder){
            this.author = builder.author;
            this.category = builder.category;
            this.title = builder.title;
            this.releaseAt = builder.releaseAt;
            this.content = builder.contentBuilder.toString();
        }

        public static Builder builder(){
            return new Builder();
        }

        @Override
        public String toString() {
            return "Document{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", category='" + category + '\'' +
                    ", content='" + content + '\'' +
                    ", releaseAt=" + releaseAt +
                    '}';
        }
    }
    public static class Builder{
        private String title;
        private String author;
        private String category;
        private LocalDateTime releaseAt;
        private final StringBuilder contentBuilder = new StringBuilder();
        public Builder title(String title){
            this.title = title;
            System.out.println(this);
            return this;
        }

        public Builder author(String author){
            this.author = author;
            System.out.println(this);
            return this;
        }

        public Builder category(String category){
            this.category = category;
            System.out.println(this);
            return this;
        }

        public Builder releaseAt(LocalDateTime releaseAt){
            this.releaseAt = releaseAt;
            System.out.println(this);
            return this;
        }

        public Builder addToContent(String contentPart){
            if(contentBuilder.length() > 0){
                contentBuilder.append(" ");
            }
            contentBuilder.append(contentPart);
            System.out.println(this);
            return this;
        }

        public Document build(){
            return new Document(this);
        }
    }

    public static void main(String[] args) {
        final Document document = Document.builder()
                .title("Master Design Patterns")
                .author("Kienroro")
                .category("Technology")
                .addToContent("Hello")
                .addToContent("World")
                .releaseAt(LocalDateTime.now()).build();
        System.out.println(document);
    }
}
