import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }

  @override
  Widget build(BuildContext context) {
   return new Scaffold(body: Row(children: <Widget>[ActionBoxView(),ActionBoxView()]));
  }
}

class ActionBoxView extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final buttonColumn = Column(children: <Widget>[
      Container(
          child: MaterialButton(
              child: Text('New button'),
              onPressed: () {
                //Do something
              }))
    ]);

    final textColumn = Column(children: <Widget>[
      Container(
        decoration: BoxDecoration(
          border: Border.all(),
          borderRadius: BorderRadius.circular(4.0),
        ),
        child: Text('PREP:'),
      )
    ]);

    return new Scaffold(
        body: new Column(
      children: <Widget>[
        Expanded(
          child: Padding(
              padding: const EdgeInsets.all(8.0),
              child: Row(children: <Widget>[
                buttonColumn,
                textColumn,
              ])),
        ),
      ],
    ));
  }
}
