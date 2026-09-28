# Phase 6 — DOM Modification

This phase focused on modifying HTML elements through JavaFX button actions.

Choice	Why We Chose It	Why Not the Alternative
JavaFX Buttons	Provide a simple way for the user to trigger DOM operations.	Automatic DOM changes would not demonstrate user interaction between JavaFX and the webpage.
setOnAction()	Connects each JavaFX button with a specific action.	Without event handling, button clicks cannot trigger DOM modifications.
executeScript()	Allows JavaFX to execute JavaScript that modifies the webpage.	JavaFX cannot directly modify HTML DOM elements without JavaScript.
Design Approach

Each button was connected to a JavaFX event handler using setOnAction().

When a button is clicked, JavaFX calls webEngine.executeScript(), which executes JavaScript on the webpage and modifies the selected DOM element.

This creates the flow:

JavaFX Button → Event Handler → JavaScript → DOM Modification

Key Decision

The main approach followed in Phase 6 was:

Create JavaFX button → handle button click → execute JavaScript → modify HTML element
