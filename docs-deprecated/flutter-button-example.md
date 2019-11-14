<!--docs:
title: ""
layout: detail
section: components
excerpt: "Material Buttons implementation article for Flutter"
iconId:
path: /
api_doc_root:
initial_release:
-->

# Buttons

Buttons allow users to take actions and make choices with a single tap.
Buttons can be customized to meet your style requirements.

For more information, go to the [Buttons](https://material.io/components/buttons/#usage) guidance page.

## Buttons variants


* [Text button](#text-button)
* [Outlined button](#outlined-button)
* [Contained button](#contained-button)
* [Toggle button](#toggle-button)

### Text button

Text buttons are typically used for less-pronounced actions, including those located:
 * In dialogs
 * In cards
In cards, text buttons help maintain an emphasis on card content.

#### Text button example

<img src="images/flutter-flat-button.png" alt="Text button with black text on white background">

##### APIs used

* [FlatButton](https://api.flutter.dev/flutter/material/FlatButton-class.html)

```dart
FlatButton(
  color: Colors.blue,
  textColor: Colors.white,
  disabledColor: Colors.grey,
  disabledTextColor: Colors.black,
  padding: EdgeInsets.all(8.0),
  splashColor: Colors.blueAccent,
  onPressed: () {
    /*...*/
  },
  child: Text(
    "Flat Button",
    style: TextStyle(fontSize: 20.0),
  ),
)

```

### Outlined button

Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.


#### Outlined button example

<img src="" alt="There currently is no accurate screenshot available">

##### APIs used
* [OutlineButton(https://api.flutter.dev/flutter/material/OutlineButton-class.html)

```dart
There is currently no source example available
```
### Contained button
Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

<img src="images/flutter_raised_button.png" alt="raised button examples: Disabled button, endabled button, and gradient button">

#### Contained button example

##### APIs used
* [FlatButton](https://api.flutter.dev/flutter/material/FlatButton-class.html): Implements a filled button without elevation or outline
* [OutlineButton](https://api.flutter.dev/flutter/material/OutlineButton-class.html): Implements a filled button with an outlined and without elevation
* [RaisedButton](https://api.flutter.dev/flutter/material/RaisedButton-class.html): Implements a filled button with a shadow (Is this the preferred implementation to create the contained button in https://material.io/components/buttons/#contained-button)

```dart
Widget build(BuildContext context) {
  return Center(
    child: Column(
      mainAxisSize: MainAxisSize.min,
      children: <Widget>[
        const RaisedButton(
          onPressed: null,
          child: Text(
            'Disabled Button',
            style: TextStyle(fontSize: 20)
          ),
        ),
        const SizedBox(height: 30),
        RaisedButton(
          onPressed: () {},
          child: const Text(
            'Enabled Button',
            style: TextStyle(fontSize: 20)
          ),
        ),
        const SizedBox(height: 30),
        RaisedButton(
          onPressed: () {},
          textColor: Colors.white,
          padding: const EdgeInsets.all(0.0),
          child: Container(
            decoration: const BoxDecoration(
              gradient: LinearGradient(
                colors: <Color>[
                  Color(0xFF0D47A1),
                  Color(0xFF1976D2),
                  Color(0xFF42A5F5),
                ],
              ),
            ),
            padding: const EdgeInsets.all(10.0),
            child: const Text(
              'Gradient Button',
              style: TextStyle(fontSize: 20)
            ),
          ),
        ),
      ],
    ),
  );
}
```

### Toggle button
Icon buttons allow users to take actions, and make choices, with a single tap. The icon button can be used to toggle between an on and off icon.


#### Toggle button example: Button strip with multiple buttons selected

The following example allows multiple buttons in a toggle button group to be depressed (selected).

<iframe><img src="https://flutter.github.io/assets-for-api-docs/assets/material/toggle_buttons_simple.mp4" alt="There is no way to embed a video in GitHub flavored MarkDown unless its hosted on either YouTube or Vimeo"></iframe>
##### APIs used
[ToggleButtons](https://api.flutter.dev/flutter/material/ToggleButtons-class.html)

```dart
ToggleButtons(
  children: <Widget>[
    Icon(Icons.ac_unit),
    Icon(Icons.call),
    Icon(Icons.cake),
  ],
  onPressed: (int index) {
    setState(() {
      isSelected[index] = !isSelected[index];
    });
  },
  isSelected: isSelected,
),
```

#### Toggle button example: Toggle icons on an image background

The following example has toggle icon buttons over a filled background.


##### APIs used

[Widget](https://api.flutter.dev/flutter/widgets/Widget-class.html)
[Container](https://api.flutter.dev/flutter/widgets/Container-class.html)
[Ink](https://api.flutter.dev/flutter/material/Ink-class.html)
[IconButton](https://api.flutter.dev/flutter/material/IconButton-class.html)

<img src="" alt="There is source available, but the image screenshot does not exist in the article or the API documentation.">

```dart
Widget build(BuildContext context) {
  return Center(
    child: Container(
      child: Ink(
        decoration: ShapeDecoration(
          color: Colors.lightBlue,
          shape: CircleBorder(),
        ),
        child: IconButton(
          icon: Icon(Icons.android),
          color: Colors.white,
          onPressed: () {
            print("filled background");
          },
        ),
      ),
    ),
  );
}
```
