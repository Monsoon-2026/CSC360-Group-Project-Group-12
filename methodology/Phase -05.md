# Phase 5: DOM Integration — Methodology

## Objective

The objective of Phase 5 was to establish communication between the JavaFX application and the HTML webpage loaded inside the JavaFX `WebView`.

In this phase, JavaScript was used to access the HTML DOM through the `WebEngine`. This allows the JavaFX application to interact with and modify elements of the webpage.

## Approach

We followed a step-by-step approach:

1. Created the JavaFX buttons for interacting with the webpage.
2. Created the `WebView` to display the HTML page.
3. Obtained the `WebEngine` from the `WebView`.
4. Loaded the HTML page using `webEngine.load()`.
5. Added an `id` attribute to the HTML element that needs to be accessed.
6. Used `webEngine.executeScript()` to execute JavaScript from the JavaFX application.
7. Used `document.getElementById()` to access the required HTML DOM element.
8. Connected the JavaFX button actions with JavaScript execution.
9. Tested the communication between JavaFX and the HTML DOM.

## DOM Integration Implementation

To allow JavaScript to access the required HTML element, an `id` was added to the heading in `webpage.html`.

```html
<h1 id="message">Hello from HTML</h1>

```
## JavaFX and JavaScript Communication
The following code was used to change the text of the HTML element:
```
changeTextButton.setOnAction(event -> {
    webEngine.executeScript(
            "document.getElementById('message').innerText = 'Text changed by JavaFX';"
    );
});

```

## JavaFX to DOM Flow
```
JavaFX Button
      ↓
Button Action
      ↓
WebEngine.executeScript()
      ↓
JavaScript
      ↓
document.getElementById()
      ↓
HTML DOM Element

```

## Result

The JavaFX application successfully communicated with the HTML webpage loaded inside the `WebView`.

The `Change Text` button successfully executed JavaScript using `WebEngine.executeScript()` and accessed the HTML element using its `id`.

When the button was clicked, the original text:

`Hello from HTML`

was changed to:

`Text changed by JavaFX`

This confirmed that the JavaFX application was able to access and interact with the HTML DOM through JavaScript.

![JavaFX DOM Integration](images/Phase5-Prrof.png)

## Phase 5 Status

Completed

JavaFX was successfully connected with the HTML DOM using JavaScript and WebEngine.executeScript(). The application is now ready for further DOM modification and dynamic webpage interactions.



