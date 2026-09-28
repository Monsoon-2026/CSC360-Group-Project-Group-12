# Phase 7 — Text and Color Changes

This phase extended the DOM modification functionality by allowing the user to dynamically change the text and color of an HTML element.

Choice	Why We Chose It	Why Not the Alternative
innerText	Provides a simple way to change the displayed text of the HTML element.	Reloading the complete webpage would be unnecessary for a simple text change.
CSS style.color	Allows the text color to be changed directly through the DOM.	Changing the complete HTML/CSS page would be unnecessary for a single color change.
Color array	Provides multiple predefined colors that can be selected sequentially.	Using only one fixed color would not demonstrate repeated dynamic changes.
Reset button	Allows the webpage to return to its original text and color.	Without a reset option, users would have to reload the entire webpage.
Design Approach

Two main DOM operations were implemented.

The Change Text button changes the text of the message element using innerText.

The Change Color button changes the text color using the element's CSS style.color property. Multiple colors are stored in an array, and the application moves to the next color after each click.

The Reset Page button restores the original text and black color.

The overall flow is:

Button Click → JavaFX Event → JavaScript → DOM Property Change → Updated Webpage

Key Decision

The main approach followed in Phase 7 was:

Use JavaScript DOM properties → modify text dynamically → modify color dynamically → provide reset functionality
