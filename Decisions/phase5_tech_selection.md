# Phase 5 — Technology Choices and Justification

This section records the key technology choices made during Phase 5 and the reasoning behind selecting them.

| Choice                        | Why We Chose It                                                                   | Why Not the Alternative                                                                                |
| ----------------------------- | --------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------ |
| JavaFX Event Handling         | Allows the buttons to respond to user clicks and perform specific actions.        | Without event handling, the buttons would only be displayed and would not provide any functionality.   |
| WebEngine `executeScript()`   | Allows JavaFX to execute JavaScript inside the loaded HTML page.                  | JavaFX cannot directly modify HTML DOM elements without a connection to the webpage.                   |
| JavaScript DOM                | Allows the application to find and modify the HTML element with the `message` ID. | Changing the HTML file directly would not provide dynamic changes during runtime.                      |
| `getElementById()`            | Provides a simple way to identify the required HTML element using its unique ID.  | Manually searching through the HTML structure would be more complicated.                               |
| `innerText` and `style.color` | Allows the application to dynamically change the text and color of the webpage.   | Reloading or replacing the complete webpage for every change would be unnecessary.                     |
| Color Array                   | Stores multiple colors and allows the Change Color button to cycle through them.  | Using separate code for every color would make the implementation longer and less flexible.            |
| Reset Functionality           | Allows the webpage to return to its original text and black color.                | Without a reset option, users would have to restart or reload the page to return to the initial state. |

## Design Approach

We decided to connect the JavaFX buttons with the HTML webpage using JavaScript.

The `Change Text` button modifies the text of the HTML element, while the `Change Color` button changes its color using a predefined array of colors. The `Reset Page` button restores the original text and color.

JavaFX handles the user interaction, while JavaScript and the DOM handle the changes inside the webpage.

## Key Decision

The main approach followed in Phase 5 was:

**JavaFX button click → Event Handler → WebEngine → JavaScript → DOM → HTML changes.**
