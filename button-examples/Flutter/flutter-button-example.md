# Buttons

[Buttons](https://material.io/components/buttons/) allow users to take actions, and make choices, with a single tap.

There are four types of buttons:

1. [Text button](#text-button)
1. [Outlined button](#outlined-button)
1. [Contained button](#contained-button)
1. [Toggle button](#toggle-button)

![Example of the four button types](images/button-types.svg)



## Text button

[Text buttons](https://material.io/components/buttons/#text-button) are typically used for less-pronounced actions, including those located in dialogs and cards. In cards, text buttons help maintain an emphasis on card content.

### Key properties

![\<Placeholder diagram of text button attribute. Replace this text if/when there is an approved diagram\>](images/text-button-diagram.png)

**1. Text button**

* A. Text label
* C. Icon


\<**NOTE** Replace table descriptions with up to 6 attributes appropriate to your platform\>

<details>
<summary><b>Styles</b></summary>
<p>

Description | Style
---|---
Default style | 
Icon style | 

</p>
</details>

<details>
<summary><b>Attributes</b></summary>
<p>

<details>
<summary>Text label</summary>
<p>

Description | Attribute |  Default value | Related method(s)
---|---|---|---
Text | | |
Color | |  | 
Typography |  |  | 

</p>
</details>

<details>
<summary>Container</summary>
<p>

Description | Attribute | Default value | Related method(s)
---|---|---|---
Color |  |  | 
Stroke color |  |  | 
Stroke width |  |  | 
Shape |  |  | 
Elevation |  |  | 
Ripple color |  |  | 

</p>
</details>

<details>
<summary>Icon</summary>
<p>

Description | Attribute | Default value | Related method(s)
---|---|---|---
Icon | |  | 
Color |  |  | 
Size |  |  | 
Gravity (position relative to text label) |  |  | 
Padding (space between icon and text label) |  |  | 

</p>
</details>

</p>
</details>


### Text button example

Source code API:
* FlatButton
    * [Class definition](https://api.flutter.dev/flutter/material/FlatButton-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/flat_button.dart)

The following example shows a text button with purple text.

!["Example of a text button with a title of 'Text Button'."](images/text-button.svg)

```dart
FlatButton(
  textColor: Color(0xFF6200EE),
  onPressed: () {
    /*...*/
  },
  child: Text("Text Button",
    style: TextStyle(fontSize: 20)
  ),
)
```

## Outlined button

[Outlined buttons](https://material.io/components/buttons/#outlined-button) are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

### Key properties

![\<Placeholder diagram of outlined button attribute. Replace this text if/when there is an approved diagram\>](images/outlined-button-diagram.png)

**1. Outlined button**

* A. Text label
* B. Container
* C. Icon

\<**NOTE** Replace table descriptions with up to 6 attributes appropriate to your platform\>

<details>
<summary><b>Styles</b></summary>
<p>

Description | Style
---|---
Default style | 
Icon style | 

</p>
</details>

<details>
<summary><b>Attributes</b></summary>
<p>

<details>
<summary>Text label</summary>
<p>

Description | Attribute |  Default value | Related method(s)
---|---|---|---
Text | | |
Color | |  | 
Typography |  |  | 

</p>
</details>

<details>
<summary>Container</summary>
<p>

Description | Attribute | Default value | Related method(s)
---|---|---|---
Color |  |  | 
Stroke color |  |  | 
Stroke width |  |  | 
Shape |  |  | 
Elevation |  |  | 
Ripple color |  |  | 

</p>
</details>

<details>
<summary>Icon</summary>
<p>

Description | Attribute | Default value | Related method(s)
---|---|---|---
Icon | |  | 
Color |  |  | 
Size |  |  | 
Gravity (position relative to text label) |  |  | 
Padding (space between icon and text label) |  |  | 

</p>
</details>

</p>
</details>

### Outlined button example

Source code API:

* OutlineButton
    * [Class definition](https://api.flutter.dev/flutter/material/OutlineButton-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/outline_button.dart)

!["Example of an outlined button with a title of 'Outlined Button'."](images/outlined-button.svg)

```dart
OutlineButton(
  textColor: Color(0xFF6200EE),
  onPressed() {
    /*...*/
  },
  child: Text(
    "Outlined Button"
     style: TextStyle(fontSize: 20)

  ),
}
```


## Contained button

[Contained buttons](https://material.io/components/buttons/#contained-button) are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.
ntained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

### Key properties

![\<Placeholder diagram of contained button attribute. Replace this text if/when there is an approved diagram\>](images/contained-button-diagram.png)

**1. Contained button**

* A. Text label
* B. Container
* C. Icon

\<**NOTE** Replace table descriptions with up to 6 attributes appropriate to your platform\>



<details>
<summary><b>Styles</b></summary>
<p>

Description | Style
---|---
Default style | 
Icon style | 

</p>
</details>

<details>
<summary><b>Attributes</b></summary>
<p>

<details>
<summary>Text label</summary>
<p>

Description | Attribute |  Default value | Related method(s)
---|---|---|---
Text | | |
Color | |  | 
Typography |  |  | 

</p>
</details>

<details>
<summary>Container</summary>
<p>

Description | Attribute | Default value | Related method(s)
---|---|---|---
Color |  |  | 
Stroke color |  |  | 
Stroke width |  |  | 
Shape |  |  | 
Elevation |  |  | 
Ripple color |  |  | 

</p>
</details>

<details>
<summary>Icon</summary>
<p>

Description | Attribute | Default value | Related method(s)
---|---|---|---
Icon | |  | 
Color |  |  | 
Size |  |  | 
Gravity (position relative to text label) |  |  | 
Padding (space between icon and text label) |  |  | 

</p>
</details>

</p>
</details>

### Contained button example

Source code API

* RaisedButton
    * [Class definition](https://api.flutter.dev/flutter/material/RaisedButton-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/raised_button.dart)

The following examples show a contained button. Color schemes are typically determined by your theme.

!["Example of a contained button with a title of 'Contained Button'."](images/contained-button.svg)


```dart
RaisedButton(
    textColor: Colors.white,
    color: Color(0xFF6200EE),
    onPressed: () {
	/*...*/
    },
    child: const Text(
         'Contained Button',
         style: TextStyle(fontSize: 20)
    ),
),

```

## Toggle button

[Toggle buttons](https://material.io/components/buttons/#toggle-button) can be used to select from a group of choices.

The toggle button can be separated into two types:
* [Toggle bar](#toggle-bar)
* [Toggle icon button](#toggle-icon-button)

### Toggle bar

The toggle bar allows you to select from a group of buttons that can be set to [selective action](https://material.io/components/buttons/#toggle-button) where only one button in a group can be selected at one time.

####  Key properties

![\<Placeholder diagram of toggle button attribute. Replace this text if/when there is an approved diagram\>](images/toggle-button-diagram.png)

**1. Toggle button**

* A. Text label
* C. Icon


\<**NOTE** Replace table descriptions with up to 6 attributes appropriate to your platform\>


<details>
<summary><b>Styles</b></summary>
<p>

Description | Style
---|---
Default style | 
Icon style | 

</p>
</details>

<details>
<summary><b>Attributes</b></summary>
<p>

<details>
<summary>Text label</summary>
<p>

Description | Attribute |  Default value | Related method(s)
---|---|---|---
Text | | |
Color | |  | 
Typography |  |  | 

</p>
</details>

<details>
<summary>Container</summary>
<p>

Description | Attribute | Default value | Related method(s)
---|---|---|---
Color |  |  | 
Stroke color |  |  | 
Stroke width |  |  | 
Shape |  |  | 
Elevation |  |  | 
Ripple color |  |  | 

</p>
</details>

<details>
<summary>Icon</summary>
<p>

Description | Attribute | Default value | Related method(s)
---|---|---|---
Icon | |  | 
Color |  |  | 
Size |  |  | 
Gravity (position relative to text label) |  |  | 
Padding (space between icon and text label) |  |  | 

</p>
</details>

</p>
</details>

#### Toggle bar with three icons example

The following example shows a toggle bar with the following icons:

* favorite
* remove red eye
* notifications


Source code APIs:
* IconButton
    * [Class definition](https://api.flutter.dev/flutter/material/IconButton-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/icon_button.dart)


The following example displays 3 `IconButton`s in a widget. The `onOressed` toggles the `isSelected` boolean:

!["Example of a set of toggle buttons with three icons: favorites, remove red eye, and notifications."](images/toggle-buttons.svg)

```dart
List<bool> isSelected = List<bool>.filled(3, false);
/*...*/
ToggleButtons(
  children: <Widget>[
    Icon(Icons.favorite),
    Icon(Icons.remove_red_eye),
    Icon(Icons.notifications),
  ],
  onPressed: (int index) {
    setState(() {
      isSelected[index] = !isSelected[index];
    });
  },
  isSelected: isSelected,
)
```

### Toggle icon button

The [toggle icon](https://material.io/components/buttons/#toggle-button) button allows you to select from a group using an icon.

#### Toggle icon button example

Source code APIs:

* StatefulWidget
    * [Class definition](https://api.flutter.dev/flutter/widgets/StatefulWidget-class.html)
    * [GitHub source](<!-- unable to find source in GitHub -->)
* GestureDetector
    * [Class defintion](https://api.flutter.dev/flutter/widgets/GestureDetector-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/widgets/gesture_detector.dart)
* GridTile
    * [Class definition](https://api.flutter.dev/flutter/material/GridTile-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/grid_tile.dart)
* GridTileBar
    * [Class definition](https://api.flutter.dev/flutter/material/GridTileBar-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/grid_tile_bar.dart)
* IconButton
    * [Class definition](https://api.flutter.dev/flutter/material/IconButton-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/icon_button.dart)
* IconData
    * [Class defintion](https://api.flutter.dev/flutter/widgets/IconData-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/widgets/icon_data.dart)

The following example shows four images arranged in a two-by-two array with a favorite icon in the upper-right corner of each image.

The photos and icon buttons are contained within instances of `GridDemoPhotoItem`, which extends the `GridTile` API. `GridDemoPhotoItem` does the following:

* fits a passed image to `Photo` to the size specified in `GridView`.
* sets the icon displayed to `on` (`favorite`) or `off` (`favorite_border`) and sets `IconData` as determined by a call to `GestureDetector`.
* sets the icon color to white as opposed to the default black

The `ToggleIconDemoState` class contains the the list of photos that become the backgrounds to the `GridDemoPhotoItem` tiles.

!["Screenshot showing four images arranged in a two-by-two array, each with a heart icon in the upper-left corner"](images/toggle_icon_screenshot_cropped.png)

```dart
import 'package:flutter/material.dart';

typedef BannerTapCallback = void Function(Photo photo);

/// Each tile has a photo within it. The photo is used to toggle the
/// icon between on and off.
class Photo {
  Photo({
    this.assetName,
    this.isFavorite = false,
  });

  final String assetName;
  bool isFavorite;
  String get tag => assetName; // Assuming that all asset names are unique.
}

/// This class is each tile within the Grid. It represents the individual items
/// you see. A widget is stateless if we know that the file will not change.
class GridDemoPhotoItem extends StatelessWidget {
  GridDemoPhotoItem({
    Key key,
    @required this.photo,
    @required this.onBannerTap,
  })  : assert(onBannerTap != null),
        super(key: key);

  final Photo photo;
  final BannerTapCallback
      onBannerTap; // User taps on the photo's header or footer.

  @override
  Widget build(BuildContext context) {
    final Widget image = GestureDetector(
      child: Hero(
        key: Key(photo.assetName),
        tag: photo.tag,
        child: Image.asset(
          photo.assetName,
          fit: BoxFit.cover,
        ),
      ),
    );

    final IconData icon =
        photo.isFavorite ? Icons.favorite : Icons.favorite_border;

    return GridTile(
        header: GestureDetector(
          onTap: () {
            onBannerTap(photo);
          },
          child: GridTileBar(
            leading: Icon(
              icon,
              color: Colors.white,
            ),
          ),
        ),
        child: image);
  }
}

/// Toggle Icon Demo is a stateful widget because it is not immutable meaning
/// that the Widget can change State. This widget is changing state each time
/// the user clicks on the Flutter Favorite Icon. Each time the user clicks on
/// that icon this page will build again. This is the reason this class has to
/// extend Stateful Widget.
class ToggleIconDemo extends StatefulWidget {
  ToggleIconDemo({Key key, this.title}) : super(key: key);

  final String title;
  @override
  ToggleIconDemoState createState() => ToggleIconDemoState();
}

class ToggleIconDemoState extends State<ToggleIconDemo> {
  List<Photo> photos = <Photo>[
    Photo(assetName: 'assets/images/toggle1.png'),
    Photo(assetName: 'assets/images/toggle2.png'),
    Photo(assetName: 'assets/images/toggle3.png'),
    Photo(assetName: 'assets/images/toggle4.png'),
  ];

  void changePage() {
    Navigator.of(context).pushReplacementNamed('/toggleBarPage');
  }

  @override
  Widget build(BuildContext context) {
    final Orientation orientation = MediaQuery.of(context).orientation;
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
        actions: [
          IconButton(
              icon: const Icon(Icons.pages),
              tooltip: 'Change Page',
              onPressed: changePage),
        ],
      ),
      body: Column(
        children: [
          Expanded(
            child: SafeArea(
              top: false,
              bottom: false,
              child: GridView.count(
                crossAxisCount: (orientation == Orientation.portrait) ? 2 : 3,
                mainAxisSpacing: 4.0,
                crossAxisSpacing: 4.0,
                padding: const EdgeInsets.all(4.0),
                childAspectRatio:
                    (orientation == Orientation.portrait) ? 1.0 : 1.3,
                children: photos.map<Widget>((Photo photo) {
                  return GridDemoPhotoItem(
                    photo: photo,
                    onBannerTap: (Photo photo) {
                      setState(() {
                        photo.isFavorite = !photo.isFavorite;
                      });
                    },
                  );
                }).toList(),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
 ```
