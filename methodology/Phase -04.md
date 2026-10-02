# Phase 4: Local HTML Integration — Methodology

## Objective

The objective of Phase 4 was to load the project's local HTML webpage inside the JavaFX `WebView`.

This phase connected the JavaFX browser component created in Phase 3 with the HTML file stored in the project's resources.

## Approach

We followed a step-by-step approach:

1. Used the `WebView` and `WebEngine` created in Phase 3.
2. Stored the HTML page as a project resource.
3. Located the HTML file using `getResource()`.
4. Converted the resource location into a URL using `toExternalForm()`.
5. Loaded the HTML page using `WebEngine.load()`.
6. Displayed the webpage inside the `WebView`.
7. Kept the control buttons at the bottom of the application.

## Local HTML Resource

The project uses a local HTML file named:

```text
webpage.html
```

The file contains the webpage content that needs to be displayed inside the JavaFX application.

The HTML page includes:

* A heading with the text `Hello from HTML`.
* An element with the ID `message`.
* A paragraph explaining that the page is loaded inside JavaFX WebView.

The `id="message"` was important because this element is used for DOM manipulation in the later phase.

## Loading the HTML Page

The HTML file was located using:

```java
String htmlPath = getClass()
        .getResource("/webpage.html")
        .toExternalForm();
```

The resulting path was then passed to the `WebEngine`:

```java
webEngine.load(htmlPath);
```

This allowed the local HTML page to be displayed inside the JavaFX `WebView`.

## Layout Design

The existing `BorderPane` structure from Phase 3 was maintained.

The layout was:

* `WebView` → Center
* Button bar → Bottom

This allowed the webpage to occupy the main area while keeping the controls easily accessible.

## Design Consideration

We used a project resource instead of a hard-coded file path.

This makes the application less dependent on a specific computer or folder location and allows the HTML file to remain part of the project structure.

## Result

After loading the local HTML file, the webpage was successfully displayed inside the JavaFX `WebView`.

The JavaFX application could now display HTML content locally, providing the foundation for the JavaFX-to-JavaScript and DOM interaction introduced in the next phase.

## Phase 4 Status

**Completed**

The local HTML webpage was successfully loaded inside the JavaFX `WebView`, and the project was ready for JavaFX button interaction with the webpage in Phase 5.
