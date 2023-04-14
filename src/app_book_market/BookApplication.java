package app_book_market;

public final class BookApplication {
    private static final BookApplication INSTANCE = new BookApplication();

    private BookApplication() {
    }

    public static BookApplication getInstance(){
        return INSTANCE;
    }
}
