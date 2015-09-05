import Covers.Cover;
import FolderTypes.Type;
import Genres.Genre;

public class Folder {

    private Cover cover;
    private Type type;

    public Folder(Cover cover, Type type) {
        this.cover = cover;
        this.type = type;
    }

    public void printDescription() {
        String stringTemplate = "Folder: Cover - %s, %s";
        System.out.println(
                String.format(stringTemplate, cover.getCoverMaterial(), type.getType())
        );
    }
}
