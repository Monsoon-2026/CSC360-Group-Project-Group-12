# Phase 5 — DOM Integration

This phase focused on connecting the JavaFX application with the HTML webpage and accessing the webpage's DOM through JavaScript.

Choice	Why We Chose It	Why Not the Alternative
JavaFX WebView	Provides an embedded browser environment inside the JavaFX application.	A normal JavaFX layout cannot directly display and interact with an HTML page.
WebEngine	Provides access to the webpage and allows Java code to execute JavaScript.	Without WebEngine, JavaFX cannot directly communicate with the webpage's JavaScript.
JavaScript DOM	Allows the application to access HTML elements such as the message element.	Directly changing HTML from Java code is not possible without using JavaScript.
Design Approach

We first loaded the HTML page inside the JavaFX WebView. The WebEngine was then used to execute JavaScript code on the loaded webpage.

For example, the application accesses the HTML element using:

document.getElementById('message')

This established the connection between the JavaFX application and the webpage DOM.

Key Decision

The main approach followed in Phase 5 was:

Load HTML in WebView → access WebEngine → execute JavaScript → access HTML DOM
