# Phase 5 — Technology Choices and Justification

This section records the key technology choices made during Phase 5 and the reasoning behind selecting them.

| Choice                                   | Why We Chose It                                                                 | Why Not the Alternative                                                                                           |
| ---------------------------------------- | ------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| JavaFX Event Handling                    | Allows buttons to respond to user actions such as clicks.                       | Without event handling, the buttons would only be visual and would not perform any actions.                       |
| WebEngine `executeScript()`              | Allows Java code to execute JavaScript inside the loaded webpage.               | Directly changing HTML elements from JavaFX is not possible without communication between JavaFX and the webpage. |
| JavaScript DOM                           | Allows the application to find and modify HTML elements dynamically.            | Reloading the complete webpage for every change would be less suitable for dynamic interaction.                   |
| `getElementById()`                       | Provides a simple way to identify the HTML element using its unique `id`.       | Searching through the complete webpage manually would be more complicated.                                        |
| JavaScript `innerText` and `style.color` | Allows the application to change the text and color of the webpage dynamically. | Changing the HTML file itself would not provide immediate runtime interaction.                                    |

## Design Approach

We decided to connect the JavaFX buttons with the HTML webpage using JavaScript.

When a button is clicked, JavaFX uses `WebEngine.executeScript()` to run JavaScript inside the loaded webpage. The JavaScript then accesses the DOM and changes the required HTML element.

This creates a clear connection between the JavaFX interface and the webpage.

## Key Decision

The main approach followed in Phase 5 was:

**JavaFX button click → JavaScript execution → DOM element selection → webpage modification.**
