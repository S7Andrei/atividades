(ns atividade.alunos)

(def notas [nota]
    (cond
        (>= nota 90) "A"
        (>= nota 80) "B"
        (>= nota 70) "C"
        (>= nota 60) "D"
        :else "F"))

(defn desempenhoG [media]
    (if (>= media 80)
    (println "Turma excelente")
    (if (>= media 60)
    (println "Bom desempenho")
    )
    (println "Precisa melhorar"))
)

(defn -main []
    (print "Qtd de alunos") (flush)
    (let [qtd (integer/parseint (read-line))]
        (loop [i 1 soma 0 apv 0]
        (if (> i qtd)
            (let [media (/ soma qtd)]
                (println "Media da turma:" media)
                (println "Aprovados:" apv)
                (println "Desempenho geral:" desempenhoG)))
                    (do 
                        (println (str "Nome do aluno:" i)) (flush)
                        (let [nome (read-line)]
                            (print "Nota:") (flush)
                            (let [nota (Double/parseDouble (read-line))
                                cnt (classificacaoNota nota)
                                apv (if(>= nota 60) 10)]
                            (println (str nome "CNT:" cnt))
                            (recur (inc i)
                                (+ soma nota)
                                (+ apv apvv))))))))