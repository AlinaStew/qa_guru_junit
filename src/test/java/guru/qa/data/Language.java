package guru.qa.data;

public enum Language {
    RU("Поиск билета"), EN("Ticket search");
    public final String description;

    Language (String description) {
        this.description = description;
    }
}
