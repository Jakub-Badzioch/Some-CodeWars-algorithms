class DubstepNE {

    public static String SongDecoder(String song)
    {
        //Zamiana WUB na spacje
        song = song.replaceAll("WUB", " ");
        //Usuniecie bialych znakow z poczatku i konca
        song = song.trim();
        //Zamiana conajmniej 1 spacji na spacje
        song = song.replaceAll("\\s+", " ");

        // regex - wyrazenia regularne

        return song;

    }

    public static void main(String[] args) {
        System.out.println(SongDecoder("WUBWUBABCWUB"));
        System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
    }
}

