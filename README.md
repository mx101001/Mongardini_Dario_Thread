# Mongardini_Dario_Thread

# 🧵 Progetto Thread - Produzione Materassi

> **Simulazione di un processo industriale di produzione materassi attraverso la programmazione concorrente in Java**

---

## 📋 Indice

- [Descrizione del Progetto](#-descrizione-del-progetto)
- [Struttura delle Classi](#-struttura-delle-classi)
- [Funzionalità dei Thread](#-funzionalità-dei-thread)
- [Istruzioni per l'Esecuzione](#-istruzioni-per-lesecuzione)
- [Tecnologie Utilizzate](#-tecnologie-utilizzate)
- [Autore e Informazioni](#-autore-e-informazioni)

---

## 🎯 Descrizione del Progetto

Questo progetto Java **simula il processo industriale** di produzione dei materassi attraverso l'utilizzo della **programmazione concorrente** con thread. L'applicazione dimostra i concetti fondamentali del **multithreading** in Java, implementando due fasi principali della produzione che vengono eseguite **simultaneamente in parallelo**.

### 🏭 Fasi di Produzione Simulate

| Fase | Thread | Operazioni | Tempo |
|------|--------|-----------|-------|
| **Assemblaggio Telaio** | `ThreadAssemblaggio` | Molle, struttura portante, bordi | ~3.5s |
| **Imbottitura** | `ThreadImbottitura` | Memory foam, lattice, rivestimento | ~4.3s |

### ⚡ Caratteristiche Principali

- ✅ **Esecuzione parallela** di processi produttivi
- ✅ **Sincronizzazione** tramite `join()`
- ✅ **Simulazione temporale** con `Thread.sleep()`
- ✅ **Gestione robusta** delle eccezioni
- ✅ **Output descrittivo** delle operazioni

---

## 🏗️ Struttura delle Classi

```
produzione.materassi
    ├── ProcessoPadre
    ├── ThreadAssemblaggio
    └── ThreadImbottitura
```

### 📦 `ProcessoPadre`

> **Classe principale** che coordina l'intero processo di produzione

**Responsabilità:**
- 🎬 Istanziazione dei thread
- ▶️ Avvio esecuzione parallela (`start()`)
- 🔄 Sincronizzazione e attesa (`join()`)
- ⚠️ Gestione eccezioni
- 📊 Output informativo

**Metodi:**
```java
public static void main(String[] args)
```

---

### 🔩 `ThreadAssemblaggio`

> **Thread dedicato** alla fase di assemblaggio del telaio

**Operazioni simulate:**

1. 🛠️ **Preparazione** area di lavoro
   ```
   Tempo: 1000ms
   ```

2. 🏗️ **Posizionamento** molle e struttura
   ```
   Tempo: 1500ms
   ```

3. 🔧 **Fissaggio** bordi perimetrali
   ```
   Tempo: 1000ms
   ```

**Metodi:**
```java
public ThreadAssemblaggio()      // Costruttore
public void run()                 // Override da Thread
```

---

### 🛏️ `ThreadImbottitura`

> **Thread dedicato** alla fase di imbottitura e rivestimento

**Operazioni simulate:**

1. 📦 **Preparazione** materiali
   ```
   Tempo: 800ms
   ```

2. 🧽 **Applicazione** memory foam
   ```
   Tempo: 1200ms
   ```

3. 🌊 **Applicazione** lattice
   ```
   Tempo: 1000ms
   ```

4. 🧵 **Rivestimento** tessuto trapuntato
   ```
   Tempo: 1300ms
   ```

**Metodi:**
```java
public ThreadImbottitura()       // Costruttore
public void run()                 // Override da Thread
```

---

## ⚙️ Funzionalità dei Thread

### 🔀 Esecuzione in Parallelo

```java
// Avvio simultaneo dei thread
threadAssemblaggio.start();
threadImbottitura.start();
```

**Vantaggi:**
- ⏱️ Ottimizzazione dei tempi di produzione
- 🔄 Simulazione realistica di ambiente industriale
- 📈 Utilizzo efficiente delle risorse

---

### ⏰ Sincronizzazione con `Thread.sleep()`

Ogni operazione utilizza pause calibrate:

| Tipo Operazione | Tempo | Esempio |
|----------------|-------|---------|
| **Veloce** | 800-1000ms | Preparazione |
| **Intermedia** | 1000-1300ms | Applicazione materiali |
| **Complessa** | 1500ms | Assemblaggio strutturale |

```java
Thread.sleep(1000);  // Simula operazione di 1 secondo
```

---

### 🔗 Coordinamento con `join()`

```java
// Attesa completamento thread
threadAssemblaggio.join();
threadImbottitura.join();
```

**Garantisce:**
- ✅ Tutti i processi completati prima della terminazione
- ✅ Sincronizzazione corretta
- ✅ Output finale accurato

---

### 🛡️ Gestione delle Eccezioni

```java
try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
    System.err.println("Thread interrotto: " + e.getMessage());
    Thread.currentThread().interrupt();
}
```

---


### 📁 Struttura del Progetto

```
tuocognome_tuonome_Thread/
│
├── 📄 README.md
├── 📊 UML_Diagram.pdf
├── 📦 javadoc.zip
│
└── 📂 produzione/
    └── 📂 materassi/
        ├── 📝 ProcessoPadre.java
        ├── 📝 ThreadAssemblaggio.java
        └── 📝 ThreadImbottitura.java
```

---

### ⚙️ Compilazione

```bash
# Dalla root del progetto
javac produzione/materassi/*.java
```

---

### ▶️ Esecuzione

```bash
java produzione.materassi.ProcessoPadre
```

---

### 📺 Output Atteso

```console
=== AVVIO PRODUZIONE MATERASSI ===

Avvio delle fasi di produzione in parallelo...

[ASSEMBLAGGIO] Inizio assemblaggio telaio del materasso
[IMBOTTITURA] Inizio preparazione materiali di imbottitura
[IMBOTTITURA] Applicazione primo strato di schiuma memory foam...
[ASSEMBLAGGIO] Posizionamento molle e struttura portante...
[IMBOTTITURA] Applicazione strato di comfort in lattice...
[ASSEMBLAGGIO] Fissaggio dei bordi perimetrali...
[IMBOTTITURA] Rivestimento con tessuto trapuntato...
[ASSEMBLAGGIO] Telaio completato con successo!
[IMBOTTITURA] Imbottitura e rivestimento completati!

=== PRODUZIONE COMPLETATA ===
Tutti i processi sono terminati con successo!
```

---
