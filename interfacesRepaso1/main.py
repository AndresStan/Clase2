from PyQt6.QtCore import QSize, Qt
from PyQt6.QtGui import QAction, QIcon
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QToolBar, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout
from Color import Color

class MainWindow(QMainWindow): # Asi se crea una clase

    # En caso de para valores decimanles es QDoubleSpinBox
    
    def __init__(self): # Asi se crea una funcio 
        super().__init__() # Siempre se pone asi para crear la funcion dentro de una clase (se llamara nada mas llamar a la clase)
        self.setWindowTitle("MiAplicacion")


        plantilla = QVBoxLayout(); 

        barra = QToolBar() 
        barra.setIconSize(QSize(16,16)) # Para indicarle que todos los iconos tendran este tamaño
        self.addToolBar(barra)

        boton1 = QAction(QIcon("icons/disk.png"), "Guardar", self) # Se usa QAction para reutilizar codigo, fijate como pongo QIcon y la ruta para añadirle el icono
        boton2 = QAction(QIcon("icons/document.png"), "Nuevo", self) # Se usa QAction para reutilizar codigo, fijate como pongo QIcon y la ruta para añadirle el icono
        boton3 = QAction(QIcon("icons/application-dock.png"), "Abrir", self) # Se usa QAction para reutilizar codigo, fijate como pongo QIcon y la ruta para añadirle el icono

        menu = self.menuBar()
        menu_archivo = menu.addMenu("&Archivo")



        label1 = QLabel("Hola!")
        label2 = QLabel("esto tiene que cambiar")



        
        plantilla.addWidget(label1)        
        plantilla.addWidget(label2)     
    
 
        widget = QWidget()
        widget.setLayout(plantilla)
        self.setCentralWidget(widget)
            
             
       
           
app = QApplication([])
window = MainWindow()
window.show()


app.exec() # Poner siempre si no la ventana se cierra instant