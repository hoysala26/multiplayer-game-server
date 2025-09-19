package Polymorphism;

class EBook extends Book {
    double fileSizeMB;

    EBook(String title, String author, double fileSizeMB) {
        super(title, author);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    void displayInfo() {
        System.out.println("E-Book: " + title + " by " + author + " (" + fileSizeMB + "MB)");
    }
}

class AudioBook extends Book {
    double lengthHours;

    AudioBook(String title, String author, double lengthHours) {
        super(title, author);
        this.lengthHours = lengthHours;
    }

    @Override
    void displayInfo() {
        System.out.println("AudioBook: " + title + " by " + author + " (" + lengthHours + " hours)");
    }
}
