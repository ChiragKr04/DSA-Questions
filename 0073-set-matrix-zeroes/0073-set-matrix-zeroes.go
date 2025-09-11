func setZeroes(matrix [][]int) {

	rowLen := len(matrix)
	colLen := len(matrix[0])

	colVar := 1

	for i := 0; i < rowLen; i++ {

		for j := 0; j < colLen; j++ {

			if matrix[i][j] == 0 {

				// mark the row[i] and col[0] as 0

				matrix[i][0] = 0

				// then mark the col to 0 if first col then mark colVar

				if j == 0 {
					colVar = 0
				} else {
					matrix[0][j] = 0
				}

			}

		}

	}

	// now traverse from matrix[1][1]
	// means not traversing first row and first col
	// because we are saving the state on first row and col
	for i := 1; i < rowLen; i++ {

		for j := 1; j < colLen; j++ {

			if matrix[i][0] == 0 || matrix[0][j] == 0 {

				// make it 0

				matrix[i][j] = 0
			}

		}

	}

	if matrix[0][0] == 0 {
		for i := 0; i < colLen; i++ {
			matrix[0][i] = 0
		}
	}

	// if colVar is 0 means mark the whole row to 0
	if colVar == 0 {
		for i := 0; i < rowLen; i++ {
			matrix[i][0] = 0
		}
	}

}