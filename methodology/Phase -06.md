# Phase 6: DOM Modification — Methodology

## Objective

The objective of Phase 6 was to modify the HTML DOM dynamically from the JavaFX application.

After establishing communication between JavaFX and the HTML DOM in Phase 5, this phase focused on using JavaScript to access and modify an existing HTML DOM element through `WebEngine.executeScript()`.

## Approach

We followed a step-by-step approach:

1. Identified the HTML element that needed to be modified.
2. Accessed the element using its unique `id`.
3. Used `WebEngine.executeScript()` to execute JavaScript from the JavaFX application.
4. Used JavaScript DOM properties to modify the selected HTML element.
5. Connected the DOM modification operation to a JavaFX button.
6. Tested the modification by running the JavaFX application and interacting with the button.

## DOM Modification Implementation

The HTML element was identified using its unique `id`, and JavaScript was used to modify its content.

```java
changeTextButton.setOnAction(event -> {
    webEngine.executeScript(
            "document.getElementById('message').innerText = 'Text changed by JavaFX';"
    );
});

## DOM Modification Flow

```text
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
      ↓
DOM Content Modified

## Testing

The DOM modification was tested by running the JavaFX application and clicking the `Change Text` button.

The original HTML text:

```text
Hello from HTML

was changed to:
Text changed by JavaFX

## Result

The HTML DOM element was successfully modified from the JavaFX application.

The `Change Text` button executed JavaScript through `WebEngine.executeScript()` and changed the content of the selected HTML element.

This demonstrated that the JavaFX application can dynamically modify webpage content through JavaScript and the HTML DOM.

## Phase 6 Status

**Completed**

DOM modification was successfully implemented using JavaFX, `WebEngine`, JavaScript, and the HTML DOM. The application is now ready for the next phase, which focuses on dynamic text and color changes.
