Welcome to IRL Adventures, an immersive terminal game that takes you on a journey full of exciting challenges and unpredictable events. This project not only offers a thrilling gaming experience but also serves as a showcase for the implementation of various design patterns, enhancing the game's structure and functionality.

Design Patterns Utilized

The Singleton pattern is employed to ensure that there is only one instance of the user's player throughout the entire game. This guarantees a consistent and unified experience, preventing unintended complications.

The Momento pattern is harnessed to save the character's stats between gaming sessions. By preserving the state of the character, players can seamlessly resume their adventures where they left off, enhancing the game's continuity.

Experience different kinds of days based on the character's fatigue level, thanks to the State pattern. This dynamic approach adds realism to the game, making each day unique and influenced by the character's energy levels.

The Observer pattern comes into play to keep track of tiring events that can alter the character's state of the day. Be prepared for unexpected twists and turns as the game dynamically responds to random events, keeping the adventure fresh and engaging.

Everyday events in the game operate similarly but with subtle differences. The Template Design pattern is utilized to streamline the implementation of these events, providing a consistent structure while allowing for individual variations.

To introduce an element of unpredictability, the Abstract Factory pattern generates random events that players might encounter during their daily adventures. This pattern enhances the diversity of gameplay, keeping users on their toes with unique challenges.
