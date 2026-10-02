# Phase 3: WebView Integration — Methodology

## Objective

The objective of Phase 3 was to integrate a browser component into the JavaFX application using `WebView` and `WebEngine`.

This phase was important because the project required HTML content to be displayed inside the JavaFX application. We first created the browser area before adding the functionality to load the HTML page.

## Approach

We followed a step-by-step approach:

1. Created the JavaFX application structure from the previous phase.
2. Created the required control buttons.
3. Created a `WebView` component.
4. Obtained the `WebEngine` from the `WebView`.
5. Used `BorderPane` to organize the application layout.
6. Placed the `WebView` in the center of the window.
7. Placed the button bar at the bottom.
8. Tested the browser component before loading the HTML page.

## WebView Integration

The `WebView` component was introduced to provide a browser area inside the JavaFX application.

The application creates:

* A `WebView` to display web content.
* A `WebEngine` to control and load web content.
* An `HBox` for the control buttons.
* A `BorderPane` to organize the webpage area and buttons.

The `WebEngine` was obtained using:

```java
WebEngine webEngine = webView.getEngine();
```

This provided the connection required for controlling the webpage in later phases.

## Layout Design

The application used a `BorderPane` as the main layout.

The layout was designed as:

* `WebView` → Center
* Button bar → Bottom

This provided a clear separation between the browser display area and the controls.

## Phase 3 Limitation

At this stage, the `WebView` and `WebEngine` were created, but no HTML page was loaded yet.

This was intentional because we wanted to verify the browser component separately before introducing local HTML loading.

## Result

After implementing the browser component, the JavaFX application successfully contained a dedicated `WebView` area with the control buttons positioned at the bottom.

This confirmed that the JavaFX application was ready for local HTML integration in the next phase.

## Phase 3 Status

**Completed**

The `WebView` and `WebEngine` integration was successfully implemented, and the project was ready to load the local HTML webpage in Phase 4.
