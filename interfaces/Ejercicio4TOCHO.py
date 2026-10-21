from PyQt6.QtCore import Qt, QDate
from PyQt6.QtWidgets import QRadioButton ,QComboBox, QDateEdit,  QApplication, QMainWindow, QMessageBox, QPushButton, QLabel, QLineEdit, QTextEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout
from Color import Color


class MainWindow(QMainWindow): # Asi se crea una clase


    def __init__(self): # Asi se crea una funcio 
        super().__init__() # Siempre se pone asi para crear la funcion dentro de una clase (se llamara nada mas llamar a la clase)
        self.setWindowTitle("MiAplicacion")

        self.num1 = "0"
        self.num2 = "0"
        self.numActual = 1
        self.acabaTerminar = False
        
        plantillaTotal = QVBoxLayout()
        plantilla789 = QHBoxLayout()
        plantilla456 = QHBoxLayout()
        plantilla123 = QHBoxLayout()
        plantillaULT = QHBoxLayout()
        
        
        boton7 = QPushButton("7")
        boton8 = QPushButton("8");
        boton9 = QPushButton("9");
        plantilla789.addWidget(boton7)
        plantilla789.addWidget(boton8)
        plantilla789.addWidget(boton9)
        
        
        boton4 = QPushButton("4");
        boton5 = QPushButton("5");
        boton6 = QPushButton("6");
        plantilla456.addWidget(boton4)
        plantilla456.addWidget(boton5)
        plantilla456.addWidget(boton6)
        
        boton1 = QPushButton("1");
        boton2 = QPushButton("2");
        boton3 = QPushButton("3");
        plantilla123.addWidget(boton1)
        plantilla123.addWidget(boton2)
        plantilla123.addWidget(boton3)
        
        botonMas = QPushButton("+");
        boton0 = QPushButton("0");
        botonIgual = QPushButton("=");
        plantillaULT.addWidget(botonMas)
        plantillaULT.addWidget(boton0)
        plantillaULT.addWidget(botonIgual)
        
        
        
        boton7.clicked.connect(self.pulsado)
        boton8.clicked.connect(self.pulsado)
        boton9.clicked.connect(self.pulsado)
        boton4.clicked.connect(self.pulsado)
        boton5.clicked.connect(self.pulsado)
        boton6.clicked.connect(self.pulsado)
        boton1.clicked.connect(self.pulsado)
        boton2.clicked.connect(self.pulsado)
        boton3.clicked.connect(self.pulsado)
        botonMas.clicked.connect(self.mas)
        boton0.clicked.connect(self.pulsado)
        botonIgual.clicked.connect(self.igual)
        
                
        
        
        
        
        self.resultado = QLabel()
        self.resultado.setAlignment(Qt.AlignmentFlag.AlignRight)
        plantillaTotal.addWidget(self.resultado)
        plantillaTotal.addLayout(plantilla789)
        plantillaTotal.addLayout(plantilla456)
        plantillaTotal.addLayout(plantilla123)
        plantillaTotal.addLayout(plantillaULT) 
        botonCE = QPushButton("CE")
        botonCE.clicked.connect(self.borrar)
        plantillaTotal.addWidget(botonCE)  
        
             
        widget = QWidget()
        widget.setLayout(plantillaTotal)
        self.setCentralWidget(widget)
        
      
    def borrar(self):
        if self.numActual == 1:
            self.num1 = 0
            self.resultado.setText("")

        else:
            self.num2 = 0
            self.resultado.setText("")
            
        
    def mas(self):
        self.resultado.setText("")
        self.numActual = 2
    
    def igual(self):
        self.resultado.setText(str(int(self.num1) + int(self.num2)))
        self.numActual = 1
        self.acabaTerminar = True
    
    def pulsado(self):
        
        if self.acabaTerminar == True:
            self.resultado.setText("")
            self.acabaTerminar = False
        
        if self.numActual == 1:
                    self.resultado.setText(self.resultado.text() + self.sender().text())
                    self.num1 = int(self.resultado.text())
                    print(self.num1)
        else:
                    self.resultado.setText(self.resultado.text() + self.sender().text())
                    self.num2 = int(self.resultado.text())
                    print(self.num2)

        
app = QApplication([])
window = MainWindow()
window.show()


app.exec() # Poner siempre si no la ventana se cierra instant