*Description

  -This Android app simulates a collection of moving shapes, including squares and circles, that move smoothly in different directions.
   The app follows the Model-View-Controller (MVC) architecture to ensure modularity and maintainability.

*Features

  -Randomized Shapes: The app generates 20 shapes (approximately half squares, half circles) with random sizes, colors, speeds, and directions.
  
  -Smooth Movement: Shapes move continuously in one of four directions: North, South, East, or West.
  
  -Boundary Wrapping: When a shape reaches a screen boundary, it reappears on the opposite side.
  
  -Dynamic Rendering: Shapes are drawn and updated in real-time for a visually smooth animation.
  
  -Black Background: The canvas background remains black to contrast with the moving shapes.

*Implementation Details

  -Shapes: Implemented as objects with attributes such as centerX, centerY, size, color, speed, and direction.

*Randomization:

 -Size: Chosen from a reasonable range to ensure shapes are neither too small nor too large.

 -Speed: Randomly assigned but constrained to a suitable range for smooth animation.

 -Position: Each shape is placed randomly within the screen at the start.

 -Game Loop: Uses a timer to update the animation at an optimal frame rate.

*MVC Architecture:

 -Model (Game.java): Manages the game logic, including shape movement and boundary wrapping.

 -View (GameView.java): Responsible for drawing shapes and updating the UI.

 -Controller (MainActivity.java): Initializes the game and controls the update loop.

*Technologies Used

 -Java for core logic

 -Android Studio for development

 -Canvas API for rendering shapes

 -TimerTask for managing animation updates

