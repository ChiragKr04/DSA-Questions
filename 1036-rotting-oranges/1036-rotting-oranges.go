func orangesRotting(arr [][]int) int {
    m, n := len(arr), len(arr[0])
	dir := [][]int{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}
	queue := [][]int{}
	notrotten := 0

	time := 0

	for i := 0; i < m; i++ {
		for j := 0; j < n; j++ {

			// if rotten
			if arr[i][j] == 2 {
				queue = append(queue, []int{i, j})
			} else if arr[i][j] == 1 {
				notrotten++
			}

		}
	}

	for len(queue) > 0 && notrotten > 0 {

        size := len(queue)

		for k := 0; k < size; k++ {

			cell := queue[0]
			queue = queue[1:]

			for _, d := range dir {

				x := cell[0] + d[0]
				y := cell[1] + d[1]

				if x >= 0 && y >= 0 && x < m && y < n && arr[x][y] == 1 {
					arr[x][y] = 2
					notrotten--
					queue = append(queue, []int{x, y})
				}

			}

		}

		time++

	}

	if notrotten > 0 {
		return -1
	}

	return time
}