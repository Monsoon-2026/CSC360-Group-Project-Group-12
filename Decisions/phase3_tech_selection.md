# Phase 3 — Technology Choices and Justification

This section records the key technology choices made during Phase 3 and the reasoning behind selecting them.

| Choice         | Why We Chose It                                                                                          | Why Not the Alternative                                                                                   |
| -------------- | -------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| JavaFX WebView | Provides an embedded browser area inside the JavaFX application and allows HTML content to be displayed. | A normal JavaFX layout alone cannot display and interact with web content.                                |
| WebEngine      | Provides the functionality required to load and control web pages inside the `WebView`.                  | Using only `WebView` would not provide the required page-loading and browser control functionality.       |
| BorderPane     | Allows us to place the `WebView` in the center and keep the buttons at the bottom.                       | Using only `HBox` would not provide the required separation between the browser area and the button area. |
| HBox           | Keeps the three control buttons arranged horizontally with consistent spacing.                           | A vertical layout would not match the intended control-bar design.                                        |

## Design Approach

We decided to introduce the browser component after completing the basic JavaFX interface.

The `WebView` was placed in the center of the application, while the existing buttons were kept at the bottom. This created a clear separation between the webpage display area and the controls.

At this stage, the `WebEngine` was created but the HTML page was not loaded yet. This allowed us to verify the browser component separately before adding webpage loading functionality in the next phase.

## Key Decision

The main approach followed in Phase 3 was:

**Add WebView → connect WebEngine → arrange the browser and controls → verify the browser integration before loading HTML.**
