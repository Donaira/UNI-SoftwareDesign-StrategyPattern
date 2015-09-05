import Covers.Cover;
import Genres.Genre;

public class Book {

    private Genre genre;
    private Cover cover;

    public Book(Genre genre, Cover cover) {
        this.genre = genre;
        this.cover = cover;
    }

    public void printDescription() {
        String stringTemplate = "Book: Genre - %s, cover - %s";
        System.out.println(
                String.format(stringTemplate, genre.getBookGenre(), cover.getCoverMaterial())
        );
    }
}
