from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout, QGroupBox, QRadioButton, QGridLayout, QStackedLayout, QTabWidget, QToolBar, QStatusBar
from Color import Color
from PyQt6.QtGui import QAction, QIcon

class MainWindow(QMainWindow): # Asi se crea una clase

    cont = 0

    def __init__(self): # Asi se crea una funcio 
        super().__init__() # Siempre se pone asi para crear la funcion dentro de una clase (se llamara nada mas llamar a la clase)
        self.setWindowTitle("MiAplicacion")
        self.setFixedSize(200, 200)
        plantilla = QGridLayout()

        self.etiqueta = QLabel("Hola!")
        self.etiqueta.setAlignment(Qt.AlignmentFlag.AlignVCenter)
        
        barra = QToolBar() 
        barra.setIconSize(QSize(16,16)) # Para indicarle que todos los iconos tendran este tamaño
        self.addToolBar(barra)
        
        boton1 = QAction(QIcon("icons/disk.png"), "Guardar", self) # Se usa QAction para reutilizar codigo, fijate como pongo QIcon y la ruta para añadirle el icono
        boton2 = QAction(QIcon("icons/document.png"), "Nuevo", self) # Se usa QAction para reutilizar codigo, fijate como pongo QIcon y la ruta para añadirle el icono
        boton3 = QAction(QIcon("icons/application-dock.png"), "Abrir", self) # Se usa QAction para reutilizar codigo, fijate como pongo QIcon y la ruta para añadirle el icono
        boton4 = QAction( "X", self)
        boton5 = QAction( "Instagram", self)
        
        boton1.setStatusTip("Este boton no hace nada") # Para que al hacer hover sobre el boton salga el tip (necesita lo de abajo tambien)
        self.setStatusBar(QStatusBar(self)) # Esto!
       
        boton1.setStatusTip("Este es el boton Guardar") # Para que al hacer hover sobre el boton salga el tip (necesita lo de abajo tambien)
        boton2.setStatusTip("Este es el boton Nuevo") # Para que al hacer hover sobre el boton salga el tip (necesita lo de abajo tambien)
        boton3.setStatusTip("Este es el boton Abrir") # Para que al hacer hover sobre el boton salga el tip (necesita lo de abajo tambien)
        boton4.setStatusTip("Siguenos en X") # Para que al hacer hover sobre el boton salga el tip (necesita lo de abajo tambien)
        boton5.setStatusTip("Siguenos en Instagram") # Para que al hacer hover sobre el boton salga el tip (necesita lo de abajo tambien)
   
        boton1.triggered.connect(self.botonpulsado)
        boton2.triggered.connect(self.botonpulsado)
        boton3.triggered.connect(self.botonpulsado)
        boton4.triggered.connect(self.botonpulsado)
        boton5.triggered.connect(self.botonpulsado)
                                
        
        barra.addAction(boton1)
        barra.addSeparator()
        barra.addAction(boton2)
        barra.addSeparator()
        barra.addAction(boton3)
        
        menu = self.menuBar()
        menu_archivo = menu.addMenu("&Archivo")
      
        menu_archivo.addAction(boton1)
        menu_archivo.addAction(boton2)
        menu_archivo.addAction(boton3)
        
        menu_ayuda = menu.addMenu("&Ayuda")
        
        menu_siguenos = menu_ayuda.addMenu("Síguenos")
        menu_siguenos.addAction(boton4)
        menu_siguenos.addAction(boton5)
    
        plantilla.addWidget(self.etiqueta, 0 ,0)
        
        widget = QWidget()
        widget.setLayout(plantilla)
        self.setCentralWidget(widget)
        
    def botonpulsado(self, s):
        self.cont+=1
        self.etiqueta.setText(f"{self.sender().text()}")
        
app = QApplication([])
window = MainWindow()
window.show()

app.exec() # Poner siempre si no la ventana se cierra instant