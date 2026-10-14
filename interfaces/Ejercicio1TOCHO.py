from PyQt6.QtCore import Qt, QDate
from PyQt6.QtWidgets import QComboBox, QDateEdit,  QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QTextEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout
from Color import Color

class MainWindow(QMainWindow): # Asi se crea una clase

    # En caso de para valores decimanles es QDoubleSpinBox
    
    def __init__(self): # Asi se crea una funcio 
        super().__init__() # Siempre se pone asi para crear la funcion dentro de una clase (se llamara nada mas llamar a la clase)
        self.setWindowTitle("MiAplicacion")

        plantillaGeneral = QVBoxLayout(); # Contenedor total
        linea1 = QHBoxLayout();
        linea2 = QHBoxLayout();
        linea3 = QHBoxLayout();
        linea4 = QHBoxLayout();
        linea5 = QHBoxLayout();
        linea1v = QVBoxLayout();
        linea2h = QHBoxLayout();
        
        
        
        label1 = QLabel("Nombre:")
        self.input1 = QLineEdit()
        
        
        label2 = QLabel("Apellidos:")
        self.input2 = QLineEdit()
        
        label3 = QLabel("Fecha de alta:")
        self.fecha3 = QDateEdit();
        self.fecha3.setCalendarPopup(True)
        self.fecha3.setMinimumDate(QDate(2006,1,1))
        
        label4 = QLabel("Departamento:")
        self.combo4 = QComboBox()
        self.combo4.addItems(["Contabilidad", "Administración", "Producción"])
        
        label5 = QLabel("Descripción:")
                
        self.edit1v = QTextEdit()
        
        boton2h1 = QPushButton("Grabar")
        boton2h2 = QPushButton("Reset")
        
        boton2h1.clicked.connect(self.grabar)
        boton2h2.clicked.connect(self.reset)
        
        
        
        linea1.addWidget(label1)  
        linea1.addWidget(self.input1)
        
        linea2.addWidget(label2)  
        linea2.addWidget(self.input2)
        
        linea3.addWidget(label3)  
        linea3.addWidget(self.fecha3)
        
        linea4.addWidget(label4)  
        linea4.addWidget(self.combo4)
        
        linea5.addWidget(label5)
        
        
        linea1v.addWidget(self.edit1v)
        
        linea2h.addWidget(boton2h1)
        linea2h.addWidget(boton2h2)
        
                
                
                
        
        
        
        

        plantillaGeneral.addLayout(linea1)
        plantillaGeneral.addLayout(linea2)
        plantillaGeneral.addLayout(linea3)
        plantillaGeneral.addLayout(linea4)
        linea5.addLayout(linea1v)
        linea1v.addLayout(linea2h)
        plantillaGeneral.addLayout(linea5)
        
        widget = QWidget()
        widget.setLayout(plantillaGeneral)
        self.setCentralWidget(widget)
      

    def reset(self):
        self.input1.setText(" ")
        self.combo4.setCurrentIndex(0)
        self.input2.setText(" ")
        self.fecha3.setDate(QDate(2006,1,1))
        self.edit1v.clear()
            
    def grabar(self):
        self.edit1v.setText(self.input1.text())
        self.edit1v.append(self.input2.text())
        self.edit1v.append(self.fecha3.text())
        self.edit1v.append(self.combo4.currentText())
              
  
           
app = QApplication([])
window = MainWindow()
window.show()


app.exec() # Poner siempre si no la ventana se cierra instant