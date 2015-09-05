import Covers.LeatherCover;
import Covers.PaperCover;
import Covers.PlasticCover;
import FolderTypes.RingBinderType;
import FolderTypes.SelfBindingType;
import Genres.FantasyGenre;
import Genres.MysteryGenre;
import Genres.RomanceGenre;

public class StrategyPatternBook {
    public static void main(String[] args) {
        Book fantasyBook = new Book(new FantasyGenre(), new LeatherCover());
        fantasyBook.printDescription();

        Book mysteryBook = new Book(new MysteryGenre(), new PlasticCover());
        mysteryBook.printDescription();

        Book romanceBook = new Book(new RomanceGenre(), new PaperCover());
        romanceBook.printDescription();

        Folder plasticFolder = new Folder(new PlasticCover(), new RingBinderType());
        plasticFolder.printDescription();

        Folder leatherFolder = new Folder(new LeatherCover(), new SelfBindingType());
        leatherFolder.printDescription();
    }
}
