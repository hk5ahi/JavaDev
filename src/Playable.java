
// Create an interface called "Playable" with an abstract method called "play." Implement the interface in classes like "Guitar" and "Piano" to play different musical instruments.
public interface Playable {

    void Sound();

}
class Guitar implements Playable {

    public void Sound() {
        System.out.println("The sound of the Guitar plays.");
    }
}
    class Piano implements Playable {

        public void Sound() {
            System.out.println("The sound of the piano plays.");
        }

    }
