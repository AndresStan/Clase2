import "package:flutter/material.dart";

class CardTipo1 extends StatelessWidget {
  const new({
    super.key,
  });

  @override
  Widget build(BuildContext context) {
    return InkWell(
      
      onTap: () {
        
      },
      child: Card(
        child: Column (
         children: [
          ListTile(
            leading: Icon(Icons.abc),
            title: Text("Mi card"),
            subtitle: Text("Et sunt qui dolor eu enim fugiat eu laboris."),
            trailing: Icon(Icons.abc),
          ),
          Padding(
            padding: const EdgeInsets.only(right: 5),
            child: Row(
              mainAxisAlignment: .end,
              children: [
                TextButton(
                  onPressed: () {
                    
                  },
                   child: Text("Cancelar")
                ),
                TextButton(
                  onPressed: () {
                    
                  },
                   child: Text("Ok")
                ),
              ],
            ),
          )
         ],
        ),
      ),
    );
  }
}

